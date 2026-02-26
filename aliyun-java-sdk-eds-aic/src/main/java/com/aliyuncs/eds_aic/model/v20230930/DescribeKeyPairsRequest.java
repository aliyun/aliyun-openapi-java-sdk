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
public class DescribeKeyPairsRequest extends RpcAcsRequest<DescribeKeyPairsResponse> {
	   

	private List<String> keyPairIdss;

	private String keyPairName;

	private String nextToken;

	private Integer maxResults;
	public DescribeKeyPairsRequest() {
		super("eds-aic", "2023-09-30", "DescribeKeyPairs");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<String> getKeyPairIdss() {
		return this.keyPairIdss;
	}

	public void setKeyPairIdss(List<String> keyPairIdss) {
		this.keyPairIdss = keyPairIdss;	
		if (keyPairIdss != null) {
			for (int i = 0; i < keyPairIdss.size(); i++) {
				putQueryParameter("KeyPairIds." + (i + 1) , keyPairIdss.get(i));
			}
		}	
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeKeyPairsResponse> getResponseClass() {
		return DescribeKeyPairsResponse.class;
	}

}
