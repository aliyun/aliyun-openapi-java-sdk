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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateSnapshotRequest extends RpcAcsRequest<UpdateSnapshotResponse> {
	   

	private String errorMessage;

	private Long actualBytes;

	private String snapshotId;

	private String clientId;

	private String vaultId;

	private String parentHash;

	private String exitCode;

	private Long duration;

	private String snapshotHash;

	private Long itemsTotal;

	private Long completeTime;

	private Long bytesTotal;

	private String errorFile;

	private String token;

	private Long itemsDone;

	private Long size;

	private Long errorCount;

	private Long bytesDone;

	private String status;
	public UpdateSnapshotRequest() {
		super("hbr", "2017-09-08", "UpdateSnapshot", "hbr");
		setProtocol(ProtocolType.HTTPS);
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

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
		}
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
		if(clientId != null){
			putQueryParameter("ClientId", clientId);
		}
	}

	public String getVaultId() {
		return this.vaultId;
	}

	public void setVaultId(String vaultId) {
		this.vaultId = vaultId;
		if(vaultId != null){
			putQueryParameter("VaultId", vaultId);
		}
	}

	public String getParentHash() {
		return this.parentHash;
	}

	public void setParentHash(String parentHash) {
		this.parentHash = parentHash;
		if(parentHash != null){
			putQueryParameter("ParentHash", parentHash);
		}
	}

	public String getExitCode() {
		return this.exitCode;
	}

	public void setExitCode(String exitCode) {
		this.exitCode = exitCode;
		if(exitCode != null){
			putQueryParameter("ExitCode", exitCode);
		}
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration.toString());
		}
	}

	public String getSnapshotHash() {
		return this.snapshotHash;
	}

	public void setSnapshotHash(String snapshotHash) {
		this.snapshotHash = snapshotHash;
		if(snapshotHash != null){
			putQueryParameter("SnapshotHash", snapshotHash);
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

	public Long getCompleteTime() {
		return this.completeTime;
	}

	public void setCompleteTime(Long completeTime) {
		this.completeTime = completeTime;
		if(completeTime != null){
			putQueryParameter("CompleteTime", completeTime.toString());
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

	public Long getSize() {
		return this.size;
	}

	public void setSize(Long size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Long getErrorCount() {
		return this.errorCount;
	}

	public void setErrorCount(Long errorCount) {
		this.errorCount = errorCount;
		if(errorCount != null){
			putQueryParameter("ErrorCount", errorCount.toString());
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
	public Class<UpdateSnapshotResponse> getResponseClass() {
		return UpdateSnapshotResponse.class;
	}

}
