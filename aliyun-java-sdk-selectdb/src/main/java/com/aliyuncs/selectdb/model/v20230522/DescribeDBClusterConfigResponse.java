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

package com.aliyuncs.selectdb.model.v20230522;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.selectdb.transform.v20230522.DescribeDBClusterConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterConfigResponse extends AcsResponse {

	private String dynamicCode;

	private String dynamicMessage;

	private String accessDeniedDetail;

	private String requestId;

	private Data data;

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public String getAccessDeniedDetail() {
		return this.accessDeniedDetail;
	}

	public void setAccessDeniedDetail(String accessDeniedDetail) {
		this.accessDeniedDetail = accessDeniedDetail;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String dbInstanceName;

		private String dbInstanceId;

		private String dbClusterId;

		private Integer taskId;

		private List<Param> params;

		public String getDbInstanceName() {
			return this.dbInstanceName;
		}

		public void setDbInstanceName(String dbInstanceName) {
			this.dbInstanceName = dbInstanceName;
		}

		public String getDbInstanceId() {
			return this.dbInstanceId;
		}

		public void setDbInstanceId(String dbInstanceId) {
			this.dbInstanceId = dbInstanceId;
		}

		public String getDbClusterId() {
			return this.dbClusterId;
		}

		public void setDbClusterId(String dbClusterId) {
			this.dbClusterId = dbClusterId;
		}

		public Integer getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Integer taskId) {
			this.taskId = taskId;
		}

		public List<Param> getParams() {
			return this.params;
		}

		public void setParams(List<Param> params) {
			this.params = params;
		}

		public static class Param {

			private String name;

			private String optional;

			private String comment;

			private String value;

			private String paramCategory;

			private String defaultValue;

			private Integer isDynamic;

			private Integer isUserModifiable;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getOptional() {
				return this.optional;
			}

			public void setOptional(String optional) {
				this.optional = optional;
			}

			public String getComment() {
				return this.comment;
			}

			public void setComment(String comment) {
				this.comment = comment;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getParamCategory() {
				return this.paramCategory;
			}

			public void setParamCategory(String paramCategory) {
				this.paramCategory = paramCategory;
			}

			public String getDefaultValue() {
				return this.defaultValue;
			}

			public void setDefaultValue(String defaultValue) {
				this.defaultValue = defaultValue;
			}

			public Integer getIsDynamic() {
				return this.isDynamic;
			}

			public void setIsDynamic(Integer isDynamic) {
				this.isDynamic = isDynamic;
			}

			public Integer getIsUserModifiable() {
				return this.isUserModifiable;
			}

			public void setIsUserModifiable(Integer isUserModifiable) {
				this.isUserModifiable = isUserModifiable;
			}
		}
	}

	@Override
	public DescribeDBClusterConfigResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
