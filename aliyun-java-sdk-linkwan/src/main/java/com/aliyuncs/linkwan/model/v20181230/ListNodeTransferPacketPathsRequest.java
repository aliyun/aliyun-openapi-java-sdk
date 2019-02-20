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

package com.aliyuncs.linkwan.model.v20181230;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListNodeTransferPacketPathsRequest extends RpcAcsRequest<ListNodeTransferPacketPathsResponse> {
	
	public ListNodeTransferPacketPathsRequest() {
		super("LinkWAN", "2018-12-30", "ListNodeTransferPacketPaths", "linkwan");
		setProtocol(ProtocolType.HTTPS);
	}

	private Integer pageNumber;

	private Integer pageSize;

	private String devEui;

	private String base64EncodedMacPayload;

	private Long logMillis;

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putBodyParameter("PageNumber", pageNumber.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getDevEui() {
		return this.devEui;
	}

	public void setDevEui(String devEui) {
		this.devEui = devEui;
		if(devEui != null){
			putBodyParameter("DevEui", devEui);
		}
	}

	public String getBase64EncodedMacPayload() {
		return this.base64EncodedMacPayload;
	}

	public void setBase64EncodedMacPayload(String base64EncodedMacPayload) {
		this.base64EncodedMacPayload = base64EncodedMacPayload;
		if(base64EncodedMacPayload != null){
			putBodyParameter("Base64EncodedMacPayload", base64EncodedMacPayload);
		}
	}

	public Long getLogMillis() {
		return this.logMillis;
	}

	public void setLogMillis(Long logMillis) {
		this.logMillis = logMillis;
		if(logMillis != null){
			putBodyParameter("LogMillis", logMillis.toString());
		}
	}

	@Override
	public Class<ListNodeTransferPacketPathsResponse> getResponseClass() {
		return ListNodeTransferPacketPathsResponse.class;
	}

}
