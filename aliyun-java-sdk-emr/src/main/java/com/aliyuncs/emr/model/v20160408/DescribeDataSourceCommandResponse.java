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
import com.aliyuncs.emr.transform.v20160408.DescribeDataSourceCommandResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataSourceCommandResponse extends AcsResponse {

	private String requestId;

	private String commandId;

	private String hostName;

	private String state;

	private Long startTime;

	private Long endTime;

	private String message;

	private String data;

	private List<Host> hostList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
	}

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Host> getHostList() {
		return this.hostList;
	}

	public void setHostList(List<Host> hostList) {
		this.hostList = hostList;
	}

	public static class Host {

		private String hostName;

		private String state;

		private Long startTime;

		private Long endTime;

		private String message;

		private String data;

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getData() {
			return this.data;
		}

		public void setData(String data) {
			this.data = data;
		}
	}

	@Override
	public DescribeDataSourceCommandResponse getInstance(UnmarshallerContext context) {
		return	DescribeDataSourceCommandResponseUnmarshaller.unmarshall(this, context);
	}
}
