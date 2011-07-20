/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.console.templates;

import static junit.framework.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.wicketstuff.console.engine.Lang;

/**
 * Testing {@link PackagedScriptTemplates}.
 * 
 * @author cretzel
 */
public class PackagedScriptTemplatesTest
{

	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void test_findAllPackagedGroovyTemplates() throws Exception
	{
		final List<ScriptTemplate> templates = new PackagedScriptTemplates().findAll(Lang.GROOVY);

		assertEquals(20, templates.size());
	}

	@Test
	public void test_getPackagedClojureTemplates() throws Exception
	{
		final List<ScriptTemplate> templates = new PackagedScriptTemplates().findAll(Lang.CLOJURE);

		assertEquals(15, templates.size());
	}

}
