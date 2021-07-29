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

package com.aliyuncs.aiccs.model.v20191015;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aiccs.transform.v20191015.ListAiccsRobotResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAiccsRobotResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String robotType;

		private String atSence;

		private String atProfession;

		private String robotName;

		private Long id;

		public String getRobotType() {
			return this.robotType;
		}

		public void setRobotType(String robotType) {
			this.robotType = robotType;
		}

		public String getAtSence() {
			return this.atSence;
		}

		public void setAtSence(String atSence) {
			this.atSence = atSence;
		}

		public String getAtProfession() {
			return this.atProfession;
		}

		public void setAtProfession(String atProfession) {
			this.atProfession = atProfession;
		}

		public String getRobotName() {
			return this.robotName;
		}

		public void setRobotName(String robotName) {
			this.robotName = robotName;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}
	}

	@Override
	public ListAiccsRobotResponse getInstance(UnmarshallerContext context) {
		return	ListAiccsRobotResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
