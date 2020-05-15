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

package com.aliyuncs.aliyunauth.model.v20181222;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aliyunauth.transform.v20181222.QueryAuthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAuthResponse extends AcsResponse {

	private Integer code;

	private Boolean success;

	private String message;

	private String requestId;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

		private String instanceId;

		private String productCode;

		private List<InfoDTOListItem> infoDTOList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public List<InfoDTOListItem> getInfoDTOList() {
			return this.infoDTOList;
		}

		public void setInfoDTOList(List<InfoDTOListItem> infoDTOList) {
			this.infoDTOList = infoDTOList;
		}

		public static class InfoDTOListItem {

			private String itemName;

			private String itemRecordVid;

			private String authOrderVid;

			private String operateCode;

			public String getItemName() {
				return this.itemName;
			}

			public void setItemName(String itemName) {
				this.itemName = itemName;
			}

			public String getItemRecordVid() {
				return this.itemRecordVid;
			}

			public void setItemRecordVid(String itemRecordVid) {
				this.itemRecordVid = itemRecordVid;
			}

			public String getAuthOrderVid() {
				return this.authOrderVid;
			}

			public void setAuthOrderVid(String authOrderVid) {
				this.authOrderVid = authOrderVid;
			}

			public String getOperateCode() {
				return this.operateCode;
			}

			public void setOperateCode(String operateCode) {
				this.operateCode = operateCode;
			}
		}
	}

	@Override
	public QueryAuthResponse getInstance(UnmarshallerContext context) {
		return	QueryAuthResponseUnmarshaller.unmarshall(this, context);
	}
}
