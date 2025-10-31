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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListEventStreamingsRequest extends RpcAcsRequest<ListEventStreamingsResponse> {
	   

	private String nextToken;

	private Integer limit;

	private String namePrefix;

	private String sourceArn;

	private List<Tags> tagss;

	private String sinkArn;
	public ListEventStreamingsRequest() {
		super("eventbridge", "2020-04-01", "ListEventStreamings");
		setMethod(MethodType.POST);
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putBodyParameter("Limit", limit.toString());
		}
	}

	public String getNamePrefix() {
		return this.namePrefix;
	}

	public void setNamePrefix(String namePrefix) {
		this.namePrefix = namePrefix;
		if(namePrefix != null){
			putBodyParameter("NamePrefix", namePrefix);
		}
	}

	public String getSourceArn() {
		return this.sourceArn;
	}

	public void setSourceArn(String sourceArn) {
		this.sourceArn = sourceArn;
		if(sourceArn != null){
			putBodyParameter("SourceArn", sourceArn);
		}
	}

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putBodyParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putBodyParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
		}	
	}

	public String getSinkArn() {
		return this.sinkArn;
	}

	public void setSinkArn(String sinkArn) {
		this.sinkArn = sinkArn;
		if(sinkArn != null){
			putBodyParameter("SinkArn", sinkArn);
		}
	}

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<ListEventStreamingsResponse> getResponseClass() {
		return ListEventStreamingsResponse.class;
	}

}
