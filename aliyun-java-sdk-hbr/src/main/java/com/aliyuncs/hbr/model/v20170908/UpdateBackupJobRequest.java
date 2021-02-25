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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateBackupJobRequest extends RpcAcsRequest<UpdateBackupJobResponse> {
	   

	private String errorMessage;

	private Long actualBytes;

	private String jobId;

	private Long itemsTotal;

	private Long bytesTotal;

	private Long expireTime;

	private String errorFile;

	private String token;

	private Long itemsDone;

	private Long actualItems;

	private Integer progress;

	private Long bytesDone;

	private String status;
	public UpdateBackupJobRequest() {
		super("hbr", "2017-09-08", "UpdateBackupJob", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
		if(errorMessage != null){
			putQueryParameter("ErrorMessage", errorMessage);
		}
	}

	public Long getActualBytes() {
		return this.actualBytes;
	}

	public void setActualBytes(Long actualBytes) {
		this.actualBytes = actualBytes;
		if(actualBytes != null){
			putQueryParameter("ActualBytes", actualBytes.toString());
		}
	}

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
		if(jobId != null){
			putQueryParameter("JobId", jobId);
		}
	}

	public Long getItemsTotal() {
		return this.itemsTotal;
	}

	public void setItemsTotal(Long itemsTotal) {
		this.itemsTotal = itemsTotal;
		if(itemsTotal != null){
			putQueryParameter("ItemsTotal", itemsTotal.toString());
		}
	}

	public Long getBytesTotal() {
		return this.bytesTotal;
	}

	public void setBytesTotal(Long bytesTotal) {
		this.bytesTotal = bytesTotal;
		if(bytesTotal != null){
			putQueryParameter("BytesTotal", bytesTotal.toString());
		}
	}

	public Long getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(Long expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime.toString());
		}
	}

	public String getErrorFile() {
		return this.errorFile;
	}

	public void setErrorFile(String errorFile) {
		this.errorFile = errorFile;
		if(errorFile != null){
			putQueryParameter("ErrorFile", errorFile);
		}
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
		if(token != null){
			putQueryParameter("Token", token);
		}
	}

	public Long getItemsDone() {
		return this.itemsDone;
	}

	public void setItemsDone(Long itemsDone) {
		this.itemsDone = itemsDone;
		if(itemsDone != null){
			putQueryParameter("ItemsDone", itemsDone.toString());
		}
	}

	public Long getActualItems() {
		return this.actualItems;
	}

	public void setActualItems(Long actualItems) {
		this.actualItems = actualItems;
		if(actualItems != null){
			putQueryParameter("ActualItems", actualItems.toString());
		}
	}

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
		if(progress != null){
			putQueryParameter("Progress", progress.toString());
		}
	}

	public Long getBytesDone() {
		return this.bytesDone;
	}

	public void setBytesDone(Long bytesDone) {
		this.bytesDone = bytesDone;
		if(bytesDone != null){
			putQueryParameter("BytesDone", bytesDone.toString());
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<UpdateBackupJobResponse> getResponseClass() {
		return UpdateBackupJobResponse.class;
	}

}
