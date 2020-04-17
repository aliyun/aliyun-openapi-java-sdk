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
import com.aliyuncs.aliyunauth.transform.v20181222.QueryInEffectQuthOrderResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInEffectQuthOrderResponse extends AcsResponse {

	private Integer code;

	private String requestId;

	private Boolean success;

	private String message;

	private Data data;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

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

		private Integer count;

		private List<ListItem> list;

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<ListItem> getList() {
			return this.list;
		}

		public void setList(List<ListItem> list) {
			this.list = list;
		}

		public static class ListItem {

			private String orderVid;

			private String lastModifyTime;

			private String createdTime;

			private Integer status;

			private List<OperateTimesItem> operateTimes;

			private List<AuthItemRecordGroupItemDTOSItem> authItemRecordGroupItemDTOS;

			public String getOrderVid() {
				return this.orderVid;
			}

			public void setOrderVid(String orderVid) {
				this.orderVid = orderVid;
			}

			public String getLastModifyTime() {
				return this.lastModifyTime;
			}

			public void setLastModifyTime(String lastModifyTime) {
				this.lastModifyTime = lastModifyTime;
			}

			public String getCreatedTime() {
				return this.createdTime;
			}

			public void setCreatedTime(String createdTime) {
				this.createdTime = createdTime;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public List<OperateTimesItem> getOperateTimes() {
				return this.operateTimes;
			}

			public void setOperateTimes(List<OperateTimesItem> operateTimes) {
				this.operateTimes = operateTimes;
			}

			public List<AuthItemRecordGroupItemDTOSItem> getAuthItemRecordGroupItemDTOS() {
				return this.authItemRecordGroupItemDTOS;
			}

			public void setAuthItemRecordGroupItemDTOS(List<AuthItemRecordGroupItemDTOSItem> authItemRecordGroupItemDTOS) {
				this.authItemRecordGroupItemDTOS = authItemRecordGroupItemDTOS;
			}

			public static class OperateTimesItem {

				private String start;

				private String end;

				public String getStart() {
					return this.start;
				}

				public void setStart(String start) {
					this.start = start;
				}

				public String getEnd() {
					return this.end;
				}

				public void setEnd(String end) {
					this.end = end;
				}
			}

			public static class AuthItemRecordGroupItemDTOSItem {

				private String vid;

				private String msg;

				private String gmtCreated;

				private String remarkDataJson;

				private String name;

				private String authitemID;

				private Integer status;

				public String getVid() {
					return this.vid;
				}

				public void setVid(String vid) {
					this.vid = vid;
				}

				public String getMsg() {
					return this.msg;
				}

				public void setMsg(String msg) {
					this.msg = msg;
				}

				public String getGmtCreated() {
					return this.gmtCreated;
				}

				public void setGmtCreated(String gmtCreated) {
					this.gmtCreated = gmtCreated;
				}

				public String getRemarkDataJson() {
					return this.remarkDataJson;
				}

				public void setRemarkDataJson(String remarkDataJson) {
					this.remarkDataJson = remarkDataJson;
				}

				public String getName() {
					return this.name;
				}

				public void setName(String name) {
					this.name = name;
				}

				public String getAuthitemID() {
					return this.authitemID;
				}

				public void setAuthitemID(String authitemID) {
					this.authitemID = authitemID;
				}

				public Integer getStatus() {
					return this.status;
				}

				public void setStatus(Integer status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public QueryInEffectQuthOrderResponse getInstance(UnmarshallerContext context) {
		return	QueryInEffectQuthOrderResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
