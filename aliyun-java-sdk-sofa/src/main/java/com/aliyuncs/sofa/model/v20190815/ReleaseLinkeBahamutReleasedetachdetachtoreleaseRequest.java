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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest extends RpcAcsRequest<ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse> {
	   

	private String overdueReason;

	private Boolean overdueFastDev;

	private List<String> iterationIdsRepeatLists;

	private String releaseId;

	private String iterationId;

	private String overdueMes;
	public ReleaseLinkeBahamutReleasedetachdetachtoreleaseRequest() {
		super("SOFA", "2019-08-15", "ReleaseLinkeBahamutReleasedetachdetachtorelease", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOverdueReason() {
		return this.overdueReason;
	}

	public void setOverdueReason(String overdueReason) {
		this.overdueReason = overdueReason;
		if(overdueReason != null){
			putBodyParameter("OverdueReason", overdueReason);
		}
	}

	public Boolean getOverdueFastDev() {
		return this.overdueFastDev;
	}

	public void setOverdueFastDev(Boolean overdueFastDev) {
		this.overdueFastDev = overdueFastDev;
		if(overdueFastDev != null){
			putBodyParameter("OverdueFastDev", overdueFastDev.toString());
		}
	}

	public List<String> getIterationIdsRepeatLists() {
		return this.iterationIdsRepeatLists;
	}

	public void setIterationIdsRepeatLists(List<String> iterationIdsRepeatLists) {
		this.iterationIdsRepeatLists = iterationIdsRepeatLists;	
		if (iterationIdsRepeatLists != null) {
			for (int i = 0; i < iterationIdsRepeatLists.size(); i++) {
				putBodyParameter("IterationIdsRepeatList." + (i + 1) , iterationIdsRepeatLists.get(i));
			}
		}	
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getIterationId() {
		return this.iterationId;
	}

	public void setIterationId(String iterationId) {
		this.iterationId = iterationId;
		if(iterationId != null){
			putBodyParameter("IterationId", iterationId);
		}
	}

	public String getOverdueMes() {
		return this.overdueMes;
	}

	public void setOverdueMes(String overdueMes) {
		this.overdueMes = overdueMes;
		if(overdueMes != null){
			putBodyParameter("OverdueMes", overdueMes);
		}
	}

	@Override
	public Class<ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse> getResponseClass() {
		return ReleaseLinkeBahamutReleasedetachdetachtoreleaseResponse.class;
	}

}
