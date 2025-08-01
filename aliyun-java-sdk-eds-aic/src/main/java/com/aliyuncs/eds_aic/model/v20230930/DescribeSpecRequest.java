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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpecRequest extends RpcAcsRequest<DescribeSpecResponse> {
	   

	private String bizRegionId;

	private String matrixSpec;

	private String specType;

	private List<String> specIdss;

	private String nextToken;

	private String specStatus;

	private Integer maxResults;

	private String saleMode;
	public DescribeSpecRequest() {
		super("eds-aic", "2023-09-30", "DescribeSpec");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getBizRegionId() {
		return this.bizRegionId;
	}

	public void setBizRegionId(String bizRegionId) {
		this.bizRegionId = bizRegionId;
		if(bizRegionId != null){
			putQueryParameter("BizRegionId", bizRegionId);
		}
	}

	public String getMatrixSpec() {
		return this.matrixSpec;
	}

	public void setMatrixSpec(String matrixSpec) {
		this.matrixSpec = matrixSpec;
		if(matrixSpec != null){
			putQueryParameter("MatrixSpec", matrixSpec);
		}
	}

	public String getSpecType() {
		return this.specType;
	}

	public void setSpecType(String specType) {
		this.specType = specType;
		if(specType != null){
			putQueryParameter("SpecType", specType);
		}
	}

	public List<String> getSpecIdss() {
		return this.specIdss;
	}

	public void setSpecIdss(List<String> specIdss) {
		this.specIdss = specIdss;	
		if (specIdss != null) {
			for (int i = 0; i < specIdss.size(); i++) {
				putQueryParameter("SpecIds." + (i + 1) , specIdss.get(i));
			}
		}	
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getSpecStatus() {
		return this.specStatus;
	}

	public void setSpecStatus(String specStatus) {
		this.specStatus = specStatus;
		if(specStatus != null){
			putQueryParameter("SpecStatus", specStatus);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public String getSaleMode() {
		return this.saleMode;
	}

	public void setSaleMode(String saleMode) {
		this.saleMode = saleMode;
		if(saleMode != null){
			putQueryParameter("SaleMode", saleMode);
		}
	}

	@Override
	public Class<DescribeSpecResponse> getResponseClass() {
		return DescribeSpecResponse.class;
	}

}
