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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListAppConversationsRequest extends RpcAcsRequest<ListAppConversationsResponse> {
	   

	private Integer pageNum;

	private String nextToken;

	private Integer pageSize;

	private String siteId;

	private Integer maxResults;

	private String botId;

	private String startModifyTime;

	private String endModifyTime;
	public ListAppConversationsRequest() {
		super("WebsiteBuild", "2025-04-29", "ListAppConversations");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putQueryParameter("SiteId", siteId);
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

	public String getBotId() {
		return this.botId;
	}

	public void setBotId(String botId) {
		this.botId = botId;
		if(botId != null){
			putQueryParameter("BotId", botId);
		}
	}

	public String getStartModifyTime() {
		return this.startModifyTime;
	}

	public void setStartModifyTime(String startModifyTime) {
		this.startModifyTime = startModifyTime;
		if(startModifyTime != null){
			putQueryParameter("StartModifyTime", startModifyTime);
		}
	}

	public String getEndModifyTime() {
		return this.endModifyTime;
	}

	public void setEndModifyTime(String endModifyTime) {
		this.endModifyTime = endModifyTime;
		if(endModifyTime != null){
			putQueryParameter("EndModifyTime", endModifyTime);
		}
	}

	@Override
	public Class<ListAppConversationsResponse> getResponseClass() {
		return ListAppConversationsResponse.class;
	}

}
