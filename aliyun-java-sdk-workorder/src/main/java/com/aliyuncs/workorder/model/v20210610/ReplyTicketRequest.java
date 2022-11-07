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

package com.aliyuncs.workorder.model.v20210610;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.workorder.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReplyTicketRequest extends RpcAcsRequest<ReplyTicketResponse> {
	   

	private String content;

	private List<String> fileNameList;

	private Boolean encrypt;

	private String ticketId;
	public ReplyTicketRequest() {
		super("Workorder", "2021-06-10", "ReplyTicket");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public List<String> getFileNameList() {
		return this.fileNameList;
	}

	public void setFileNameList(List<String> fileNameList) {
		this.fileNameList = fileNameList;	
		if (fileNameList != null) {
			String fileNameListArrVal = "";
			for(int depth1 = 0; depth1 < fileNameList.size(); depth1++) {
				fileNameListArrVal += fileNameList.get(depth1) + ",";
			}
			if (fileNameListArrVal.length() > 0) {
				fileNameListArrVal = fileNameListArrVal.substring(0, fileNameListArrVal.length() - 1);
			}
			putQueryParameter("FileNameList" , fileNameListArrVal);
		}	
	}

	public Boolean getEncrypt() {
		return this.encrypt;
	}

	public void setEncrypt(Boolean encrypt) {
		this.encrypt = encrypt;
		if(encrypt != null){
			putBodyParameter("Encrypt", encrypt.toString());
		}
	}

	public String getTicketId() {
		return this.ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
		if(ticketId != null){
			putBodyParameter("TicketId", ticketId);
		}
	}

	@Override
	public Class<ReplyTicketResponse> getResponseClass() {
		return ReplyTicketResponse.class;
	}

}
