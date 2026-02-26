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

package com.aliyuncs.ecs_workbench.model.v20220220;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListTerminalCommandsRequest extends RpcAcsRequest<ListTerminalCommandsResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String terminalSessionToken;
	public ListTerminalCommandsRequest() {
		super("ecs-workbench", "2022-02-20", "ListTerminalCommands", "ecs-workbench");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

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

	public String getTerminalSessionToken() {
		return this.terminalSessionToken;
	}

	public void setTerminalSessionToken(String terminalSessionToken) {
		this.terminalSessionToken = terminalSessionToken;
		if(terminalSessionToken != null){
			putBodyParameter("TerminalSessionToken", terminalSessionToken);
		}
	}

	@Override
	public Class<ListTerminalCommandsResponse> getResponseClass() {
		return ListTerminalCommandsResponse.class;
	}

}
