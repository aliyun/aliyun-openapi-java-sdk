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

package com.aliyuncs.cms.model.v20180308;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DeleteEventTargetsRequest extends RpcAcsRequest<DeleteEventTargetsResponse> {
	
	public DeleteEventTargetsRequest() {
		super("Cms", "2018-03-08", "DeleteEventTargets", "cms");
	}

	private List<String> idss;

	private String ruleName;

	public List<String> getIdss() {
		return this.idss;
	}

	public void setIdss(List<String> idss) {
		this.idss = idss;	
		if (idss != null) {
			for (int i = 0; i < idss.size(); i++) {
				putQueryParameter("Ids." + (i + 1) , idss.get(i));
			}
		}	
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	@Override
	public Class<DeleteEventTargetsResponse> getResponseClass() {
		return DeleteEventTargetsResponse.class;
	}

}
