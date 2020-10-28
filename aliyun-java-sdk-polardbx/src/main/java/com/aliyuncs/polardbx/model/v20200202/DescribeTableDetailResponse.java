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

package com.aliyuncs.polardbx.model.v20200202;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardbx.transform.v20200202.DescribeTableDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTableDetailResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<Field> fields;

		public List<Field> getFields() {
			return this.fields;
		}

		public void setFields(List<Field> fields) {
			this.fields = fields;
		}

		public static class Field {

			private String column;

			private String dataType;

			private String key;

			private String extra;

			public String getColumn() {
				return this.column;
			}

			public void setColumn(String column) {
				this.column = column;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getExtra() {
				return this.extra;
			}

			public void setExtra(String extra) {
				this.extra = extra;
			}
		}
	}

	@Override
	public DescribeTableDetailResponse getInstance(UnmarshallerContext context) {
		return	DescribeTableDetailResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
