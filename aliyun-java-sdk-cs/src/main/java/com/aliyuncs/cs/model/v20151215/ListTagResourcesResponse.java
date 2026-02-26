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
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cs.transform.v20151215.ListTagResourcesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTagResourcesResponse extends AcsResponse {

	private String next_token;

	private String request_id;

	private Tag_resources tag_resources;

	public String getNext_token() {
		return this.next_token;
	}

	public void setNext_token(String next_token) {
		this.next_token = next_token;
	}

	public String getRequest_id() {
		return this.request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public Tag_resources getTag_resources() {
		return this.tag_resources;
	}

	public void setTag_resources(Tag_resources tag_resources) {
		this.tag_resources = tag_resources;
	}

	public static class Tag_resources {

		private List<Tag_resourceItem> tag_resource;

		public List<Tag_resourceItem> getTag_resource() {
			return this.tag_resource;
		}

		public void setTag_resource(List<Tag_resourceItem> tag_resource) {
			this.tag_resource = tag_resource;
		}

		public static class Tag_resourceItem {

			private String tag_key;

			private String tag_value;

			private String resource_id;

			private String resource_type;

			public String getTag_key() {
				return this.tag_key;
			}

			public void setTag_key(String tag_key) {
				this.tag_key = tag_key;
			}

			public String getTag_value() {
				return this.tag_value;
			}

			public void setTag_value(String tag_value) {
				this.tag_value = tag_value;
			}

			public String getResource_id() {
				return this.resource_id;
			}

			public void setResource_id(String resource_id) {
				this.resource_id = resource_id;
			}

			public String getResource_type() {
				return this.resource_type;
			}

			public void setResource_type(String resource_type) {
				this.resource_type = resource_type;
			}
		}
	}

	@Override
	public ListTagResourcesResponse getInstance(UnmarshallerContext context) {
		return	ListTagResourcesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
