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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.DescribeClusterServiceConfigTagResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeClusterServiceConfigTagResponse extends AcsResponse {

	private String requestId;

	private List<ConfigTag> configTagList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ConfigTag> getConfigTagList() {
		return this.configTagList;
	}

	public void setConfigTagList(List<ConfigTag> configTagList) {
		this.configTagList = configTagList;
	}

	public static class ConfigTag {

		private String tag;

		private String tagDesc;

		private List<Value> valueList;

		public String getTag() {
			return this.tag;
		}

		public void setTag(String tag) {
			this.tag = tag;
		}

		public String getTagDesc() {
			return this.tagDesc;
		}

		public void setTagDesc(String tagDesc) {
			this.tagDesc = tagDesc;
		}

		public List<Value> getValueList() {
			return this.valueList;
		}

		public void setValueList(List<Value> valueList) {
			this.valueList = valueList;
		}

		public static class Value {

			private String value;

			private String valueDesc;

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueDesc() {
				return this.valueDesc;
			}

			public void setValueDesc(String valueDesc) {
				this.valueDesc = valueDesc;
			}
		}
	}

	@Override
	public DescribeClusterServiceConfigTagResponse getInstance(UnmarshallerContext context) {
		return	DescribeClusterServiceConfigTagResponseUnmarshaller.unmarshall(this, context);
	}
}
