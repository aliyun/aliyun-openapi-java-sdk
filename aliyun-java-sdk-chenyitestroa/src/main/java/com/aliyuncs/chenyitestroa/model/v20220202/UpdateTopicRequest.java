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

package com.aliyuncs.chenyitestroa.model.v20220202;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateTopicRequest extends RoaAcsRequest<UpdateTopicResponse> {
	   

	private String topicId;
	public UpdateTopicRequest() {
		super("chenYiTestRoa", "2022-02-02", "UpdateTopic");
		setUriPattern("/ChenyiTest/Topic/[TopicId]");
		setMethod(MethodType.PATCH);
	}

	public String getTopicId() {
		return this.topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
		if(topicId != null){
			putPathParameter("TopicId", topicId);
		}
	}

	@Override
	public Class<UpdateTopicResponse> getResponseClass() {
		return UpdateTopicResponse.class;
	}

}
