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

package com.aliyuncs.nlp_automl.model.v20191111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlp_automl.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunContactReviewRequest extends RpcAcsRequest<RunContactReviewResponse> {
	   

	private String contactScene;

	private String contactPath;
	public RunContactReviewRequest() {
		super("nlp-automl", "2019-11-11", "RunContactReview", "nlpautoml");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getContactScene() {
		return this.contactScene;
	}

	public void setContactScene(String contactScene) {
		this.contactScene = contactScene;
		if(contactScene != null){
			putBodyParameter("ContactScene", contactScene);
		}
	}

	public String getContactPath() {
		return this.contactPath;
	}

	public void setContactPath(String contactPath) {
		this.contactPath = contactPath;
		if(contactPath != null){
			putBodyParameter("ContactPath", contactPath);
		}
	}

	@Override
	public Class<RunContactReviewResponse> getResponseClass() {
		return RunContactReviewResponse.class;
	}

}
