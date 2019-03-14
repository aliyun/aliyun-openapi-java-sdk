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

package com.aliyuncs.cr.model.v20160607;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteRepoWebhookRequest extends RoaAcsRequest<DeleteRepoWebhookResponse> {
	
	public DeleteRepoWebhookRequest() {
		super("cr", "2016-06-07", "DeleteRepoWebhook", "cr");
		setUriPattern("/repos/[RepoNamespace]/[RepoName]/webhooks/[WebhookId]");
		setMethod(MethodType.DELETE);
	}

	private String repoNamespace;

	private Long webhookId;

	private String repoName;

	public String getRepoNamespace() {
		return this.repoNamespace;
	}

	public void setRepoNamespace(String repoNamespace) {
		this.repoNamespace = repoNamespace;
		if(repoNamespace != null){
			putPathParameter("RepoNamespace", repoNamespace);
		}
	}

	public Long getWebhookId() {
		return this.webhookId;
	}

	public void setWebhookId(Long webhookId) {
		this.webhookId = webhookId;
		if(webhookId != null){
			putPathParameter("WebhookId", webhookId.toString());
		}
	}

	public String getRepoName() {
		return this.repoName;
	}

	public void setRepoName(String repoName) {
		this.repoName = repoName;
		if(repoName != null){
			putPathParameter("RepoName", repoName);
		}
	}

	@Override
	public Class<DeleteRepoWebhookResponse> getResponseClass() {
		return DeleteRepoWebhookResponse.class;
	}

}
