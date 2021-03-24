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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class HandleSecurityEventsRequest extends RpcAcsRequest<HandleSecurityEventsResponse> {
	   

	private String markMissParam;

	private Long resourceOwnerId;

	private List<String> securityEventIdss;

	private String sourceIp;

	private String operationCode;

	private String operationParams;

	private String markBatch;
	public HandleSecurityEventsRequest() {
		super("Sas", "2018-12-03", "HandleSecurityEvents", "sas");
		setMethod(MethodType.POST);
	}

	public String getMarkMissParam() {
		return this.markMissParam;
	}

	public void setMarkMissParam(String markMissParam) {
		this.markMissParam = markMissParam;
		if(markMissParam != null){
			putQueryParameter("MarkMissParam", markMissParam);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public List<String> getSecurityEventIdss() {
		return this.securityEventIdss;
	}

	public void setSecurityEventIdss(List<String> securityEventIdss) {
		this.securityEventIdss = securityEventIdss;	
		if (securityEventIdss != null) {
			for (int i = 0; i < securityEventIdss.size(); i++) {
				putQueryParameter("SecurityEventIds." + (i + 1) , securityEventIdss.get(i));
			}
		}	
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getOperationCode() {
		return this.operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
		if(operationCode != null){
			putQueryParameter("OperationCode", operationCode);
		}
	}

	public String getOperationParams() {
		return this.operationParams;
	}

	public void setOperationParams(String operationParams) {
		this.operationParams = operationParams;
		if(operationParams != null){
			putQueryParameter("OperationParams", operationParams);
		}
	}

	public String getMarkBatch() {
		return this.markBatch;
	}

	public void setMarkBatch(String markBatch) {
		this.markBatch = markBatch;
		if(markBatch != null){
			putQueryParameter("MarkBatch", markBatch);
		}
	}

	@Override
	public Class<HandleSecurityEventsResponse> getResponseClass() {
		return HandleSecurityEventsResponse.class;
	}

}
