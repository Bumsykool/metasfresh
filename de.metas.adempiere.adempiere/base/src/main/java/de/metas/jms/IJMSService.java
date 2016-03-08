package de.metas.jms;

import javax.jms.ConnectionFactory;

import org.adempiere.util.ISingletonService;
import org.compiere.db.CConnection;

/*
 * #%L
 * de.metas.adempiere.adempiere.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */
/**
 *
 * @author metas-dev <dev@metas-fresh.com>
 *
 */
public interface IJMSService extends ISingletonService
{
	/**
	 * Create a JMS connection factory that can be used to connect to the JMS broker.
	 *
	 * @return
	 */
	ConnectionFactory createConnectionFactory();

	/**
	 * @param cConnection may be <code>null</code>. The connection from which to get the server and port. If <code>null</code>, then use {@link CConnection#get()}. Note that in the early stages of
	 *            startup, we can't rely on {@link CConnection#get()} to work for us.
	 *
	 * @return
	 */
	String getJmsURL(CConnection cConnection);

	/**
	 * Start a local JMS broker. Used when a client is run in "embedded-server-mode" or when a metasfresh-server is not accompanied by an ESR server.
	 * <p>
	 * Note: this method is thread-safe. Only the first invocation will start a broker. Consecutive invocations will have no effect.
	 */
	void startEmbeddedBrocker();
}
