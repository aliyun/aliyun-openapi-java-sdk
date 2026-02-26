/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.cs.model.v20151215;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.DescribeAddonsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAddonsResponse extends AcsResponse {

	private Map<Object,Object> standardComponents;

	private List<ComponentGroup> componentGroups;

	public Map<Object,Object> getStandardComponents() {
		return this.standardComponents;
	}

	public void setStandardComponents(Map<Object,Object> standardComponents) {
		this.standardComponents = standardComponents;
	}

	public List<ComponentGroup> getComponentGroups() {
		return this.componentGroups;
	}

	public void setComponentGroups(List<ComponentGroup> componentGroups) {
		this.componentGroups = componentGroups;
	}

	public static class ComponentGroup {

		private String group_name;

		private List<Item> items;

		public String getGroup_name() {
			return this.group_name;
		}

		public void setGroup_name(String group_name) {
			this.group_name = group_name;
		}

		public List<Item> getItems() {
			return this.items;
		}

		public void setItems(List<Item> items) {
			this.items = items;
		}

		public static class Item {

			private String name;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}
		}
	}

	@Override
	public DescribeAddonsResponse getInstance(UnmarshallerContext context) {
		return	DescribeAddonsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
