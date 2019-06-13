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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeTaskInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTaskInfoResponse extends AcsResponse {

	private String requestId;

	private String taskId;

	private String beginTime;

	private String finishTime;

	private String createTime;

	private String taskAction;

	private String dBName;

	private String taskErrorCode;

	private String progress;

	private String expectedFinishTime;

	private String taskErrorMessage;

	private String progressInfo;

	private String status;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getTaskId() {
		return this.taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(String finishTime) {
		this.finishTime = finishTime;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTaskAction() {
		return this.taskAction;
	}

	public void setTaskAction(String taskAction) {
		this.taskAction = taskAction;
	}

	public String getDBName() {
		return this.dBName;
	}

	public void setDBName(String dBName) {
		this.dBName = dBName;
	}

	public String getTaskErrorCode() {
		return this.taskErrorCode;
	}

	public void setTaskErrorCode(String taskErrorCode) {
		this.taskErrorCode = taskErrorCode;
	}

	public String getProgress() {
		return this.progress;
	}

	public void setProgress(String progress) {
		this.progress = progress;
	}

	public String getExpectedFinishTime() {
		return this.expectedFinishTime;
	}

	public void setExpectedFinishTime(String expectedFinishTime) {
		this.expectedFinishTime = expectedFinishTime;
	}

	public String getTaskErrorMessage() {
		return this.taskErrorMessage;
	}

	public void setTaskErrorMessage(String taskErrorMessage) {
		this.taskErrorMessage = taskErrorMessage;
	}

	public String getProgressInfo() {
		return this.progressInfo;
	}

	public void setProgressInfo(String progressInfo) {
		this.progressInfo = progressInfo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public DescribeTaskInfoResponse getInstance(UnmarshallerContext context) {
		return	DescribeTaskInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
