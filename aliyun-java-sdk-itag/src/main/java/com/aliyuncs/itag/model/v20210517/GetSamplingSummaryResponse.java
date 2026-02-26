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

package com.aliyuncs.itag.model.v20210517;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.itag.transform.v20210517.GetSamplingSummaryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSamplingSummaryResponse extends AcsResponse {

	private String requestId;

	private Integer code;

	private String msg;

	private String errInfo;

	private Boolean succ;

	private Long rt;

	private String host;

	private String errorCode;

	private Result result;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getErrInfo() {
		return this.errInfo;
	}

	public void setErrInfo(String errInfo) {
		this.errInfo = errInfo;
	}

	public Boolean getSucc() {
		return this.succ;
	}

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}

	public Long getRt() {
		return this.rt;
	}

	public void setRt(Long rt) {
		this.rt = rt;
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Integer totalSubTask;

		private Integer totalItem;

		private Integer actualItem;

		private Integer actualSubTask;

		private Float accuracy;

		private Integer errorItem;

		private Integer noFixedItem;

		private List<PersonSummaryDTOListItem> personSummaryDTOList;

		public Integer getTotalSubTask() {
			return this.totalSubTask;
		}

		public void setTotalSubTask(Integer totalSubTask) {
			this.totalSubTask = totalSubTask;
		}

		public Integer getTotalItem() {
			return this.totalItem;
		}

		public void setTotalItem(Integer totalItem) {
			this.totalItem = totalItem;
		}

		public Integer getActualItem() {
			return this.actualItem;
		}

		public void setActualItem(Integer actualItem) {
			this.actualItem = actualItem;
		}

		public Integer getActualSubTask() {
			return this.actualSubTask;
		}

		public void setActualSubTask(Integer actualSubTask) {
			this.actualSubTask = actualSubTask;
		}

		public Float getAccuracy() {
			return this.accuracy;
		}

		public void setAccuracy(Float accuracy) {
			this.accuracy = accuracy;
		}

		public Integer getErrorItem() {
			return this.errorItem;
		}

		public void setErrorItem(Integer errorItem) {
			this.errorItem = errorItem;
		}

		public Integer getNoFixedItem() {
			return this.noFixedItem;
		}

		public void setNoFixedItem(Integer noFixedItem) {
			this.noFixedItem = noFixedItem;
		}

		public List<PersonSummaryDTOListItem> getPersonSummaryDTOList() {
			return this.personSummaryDTOList;
		}

		public void setPersonSummaryDTOList(List<PersonSummaryDTOListItem> personSummaryDTOList) {
			this.personSummaryDTOList = personSummaryDTOList;
		}

		public static class PersonSummaryDTOListItem {

			private String userName;

			private String userId;

			private Integer personTotalItem;

			private Integer personActualItem;

			private Integer personErrorItem;

			private Float personAccuracy;

			public String getUserName() {
				return this.userName;
			}

			public void setUserName(String userName) {
				this.userName = userName;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}

			public Integer getPersonTotalItem() {
				return this.personTotalItem;
			}

			public void setPersonTotalItem(Integer personTotalItem) {
				this.personTotalItem = personTotalItem;
			}

			public Integer getPersonActualItem() {
				return this.personActualItem;
			}

			public void setPersonActualItem(Integer personActualItem) {
				this.personActualItem = personActualItem;
			}

			public Integer getPersonErrorItem() {
				return this.personErrorItem;
			}

			public void setPersonErrorItem(Integer personErrorItem) {
				this.personErrorItem = personErrorItem;
			}

			public Float getPersonAccuracy() {
				return this.personAccuracy;
			}

			public void setPersonAccuracy(Float personAccuracy) {
				this.personAccuracy = personAccuracy;
			}
		}
	}

	@Override
	public GetSamplingSummaryResponse getInstance(UnmarshallerContext context) {
		return	GetSamplingSummaryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
