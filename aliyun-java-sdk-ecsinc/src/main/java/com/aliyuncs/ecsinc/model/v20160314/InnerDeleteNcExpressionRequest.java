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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class InnerDeleteNcExpressionRequest extends RpcAcsRequest<InnerDeleteNcExpressionResponse> {
	
	public InnerDeleteNcExpressionRequest() {
		super("EcsInc", "2016-03-14", "InnerDeleteNcExpression", "ecs", "innerAPI");
	}

	private String grayBid;

	private Long grayAliUid;

	private List<String> ecsInstanceIds;

	private List<String> vSwitchIds;

	public String getGrayBid() {
		return this.grayBid;
	}

	public void setGrayBid(String grayBid) {
		this.grayBid = grayBid;
		if(grayBid != null){
			putQueryParameter("GrayBid", grayBid);
		}
	}

	public Long getGrayAliUid() {
		return this.grayAliUid;
	}

	public void setGrayAliUid(Long grayAliUid) {
		this.grayAliUid = grayAliUid;
		if(grayAliUid != null){
			putQueryParameter("GrayAliUid", grayAliUid.toString());
		}
	}

	public List<String> getEcsInstanceIds() {
		return this.ecsInstanceIds;
	}

	public void setEcsInstanceIds(List<String> ecsInstanceIds) {
		this.ecsInstanceIds = ecsInstanceIds;	
		if (ecsInstanceIds != null) {
			for (int i = 0; i < ecsInstanceIds.size(); i++) {
				putQueryParameter("EcsInstanceId." + (i + 1) , ecsInstanceIds.get(i));
			}
		}	
	}

	public List<String> getVSwitchIds() {
		return this.vSwitchIds;
	}

	public void setVSwitchIds(List<String> vSwitchIds) {
		this.vSwitchIds = vSwitchIds;	
		if (vSwitchIds != null) {
			for (int i = 0; i < vSwitchIds.size(); i++) {
				putQueryParameter("VSwitchId." + (i + 1) , vSwitchIds.get(i));
			}
		}	
	}

	@Override
	public Class<InnerDeleteNcExpressionResponse> getResponseClass() {
		return InnerDeleteNcExpressionResponse.class;
	}

}
