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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeantcodeAntcodeProjectreviewconfigRequest extends RpcAcsRequest<UpdateLinkeantcodeAntcodeProjectreviewconfigResponse> {
	   

	private String submitterCanReview;

	private String threshold;

	private String rulesType;

	private String id;

	private String requestGitOperate;

	private String thresholdClear;
	public UpdateLinkeantcodeAntcodeProjectreviewconfigRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeantcodeAntcodeProjectreviewconfig", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSubmitterCanReview() {
		return this.submitterCanReview;
	}

	public void setSubmitterCanReview(String submitterCanReview) {
		this.submitterCanReview = submitterCanReview;
		if(submitterCanReview != null){
			putBodyParameter("SubmitterCanReview", submitterCanReview);
		}
	}

	public String getThreshold() {
		return this.threshold;
	}

	public void setThreshold(String threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putBodyParameter("Threshold", threshold);
		}
	}

	public String getRulesType() {
		return this.rulesType;
	}

	public void setRulesType(String rulesType) {
		this.rulesType = rulesType;
		if(rulesType != null){
			putBodyParameter("RulesType", rulesType);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public String getRequestGitOperate() {
		return this.requestGitOperate;
	}

	public void setRequestGitOperate(String requestGitOperate) {
		this.requestGitOperate = requestGitOperate;
		if(requestGitOperate != null){
			putBodyParameter("RequestGitOperate", requestGitOperate);
		}
	}

	public String getThresholdClear() {
		return this.thresholdClear;
	}

	public void setThresholdClear(String thresholdClear) {
		this.thresholdClear = thresholdClear;
		if(thresholdClear != null){
			putBodyParameter("ThresholdClear", thresholdClear);
		}
	}

	@Override
	public Class<UpdateLinkeantcodeAntcodeProjectreviewconfigResponse> getResponseClass() {
		return UpdateLinkeantcodeAntcodeProjectreviewconfigResponse.class;
	}

}
