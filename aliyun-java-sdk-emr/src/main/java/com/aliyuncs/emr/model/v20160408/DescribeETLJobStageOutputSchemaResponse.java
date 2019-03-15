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
import com.aliyuncs.emr.transform.v20160408.DescribeETLJobStageOutputSchemaResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeETLJobStageOutputSchemaResponse extends AcsResponse {

	private String requestId;

	private Schema schema;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Schema getSchema() {
		return this.schema;
	}

	public void setSchema(Schema schema) {
		this.schema = schema;
	}

	public static class Schema {

		private String name;

		private List<Field> fields;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public List<Field> getFields() {
			return this.fields;
		}

		public void setFields(List<Field> fields) {
			this.fields = fields;
		}

		public static class Field {

			private String type;

			private String name;

			private Integer index;

			private String rawType;

			private String assignType;

			private String assignValue;

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public String getRawType() {
				return this.rawType;
			}

			public void setRawType(String rawType) {
				this.rawType = rawType;
			}

			public String getAssignType() {
				return this.assignType;
			}

			public void setAssignType(String assignType) {
				this.assignType = assignType;
			}

			public String getAssignValue() {
				return this.assignValue;
			}

			public void setAssignValue(String assignValue) {
				this.assignValue = assignValue;
			}
		}
	}

	@Override
	public DescribeETLJobStageOutputSchemaResponse getInstance(UnmarshallerContext context) {
		return	DescribeETLJobStageOutputSchemaResponseUnmarshaller.unmarshall(this, context);
	}
}
