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

package com.aliyuncs.linkvisual.model.v20180120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkvisual.transform.v20180120.GetAIJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAIJobResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String errorMessage;

	private String code;

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

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<DataDTOListItem> dataDTOList;

		private ActionJobDTO actionJobDTO;

		public List<DataDTOListItem> getDataDTOList() {
			return this.dataDTOList;
		}

		public void setDataDTOList(List<DataDTOListItem> dataDTOList) {
			this.dataDTOList = dataDTOList;
		}

		public ActionJobDTO getActionJobDTO() {
			return this.actionJobDTO;
		}

		public void setActionJobDTO(ActionJobDTO actionJobDTO) {
			this.actionJobDTO = actionJobDTO;
		}

		public static class DataDTOListItem {

			private String dataId;

			private String dataType;

			private String dataSource;

			private String algoData;

			private String jobId;

			private String iotId;

			public String getDataId() {
				return this.dataId;
			}

			public void setDataId(String dataId) {
				this.dataId = dataId;
			}

			public String getDataType() {
				return this.dataType;
			}

			public void setDataType(String dataType) {
				this.dataType = dataType;
			}

			public String getDataSource() {
				return this.dataSource;
			}

			public void setDataSource(String dataSource) {
				this.dataSource = dataSource;
			}

			public String getAlgoData() {
				return this.algoData;
			}

			public void setAlgoData(String algoData) {
				this.algoData = algoData;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}
		}

		public static class ActionJobDTO {

			private String jobId;

			private String actionId;

			private Integer status;

			private String iotId;

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getActionId() {
				return this.actionId;
			}

			public void setActionId(String actionId) {
				this.actionId = actionId;
			}

			public Integer getStatus() {
				return this.status;
			}

			public void setStatus(Integer status) {
				this.status = status;
			}

			public String getIotId() {
				return this.iotId;
			}

			public void setIotId(String iotId) {
				this.iotId = iotId;
			}
		}
	}

	@Override
	public GetAIJobResponse getInstance(UnmarshallerContext context) {
		return	GetAIJobResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
