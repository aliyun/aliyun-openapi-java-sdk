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

package com.aliyuncs.afs.model.v20180112;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AnalyzeNvcRequest extends RpcAcsRequest<AnalyzeNvcResponse> {
	
	public AnalyzeNvcRequest() {
		super("afs", "2018-01-12", "AnalyzeNvc", "afs");
	}

	private String sourceIp;

	private String data;

	private String scoreJsonStr;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
		if(data != null){
			putQueryParameter("Data", data);
		}
	}

	public String getScoreJsonStr() {
		return this.scoreJsonStr;
	}

	public void setScoreJsonStr(String scoreJsonStr) {
		this.scoreJsonStr = scoreJsonStr;
		if(scoreJsonStr != null){
			putQueryParameter("ScoreJsonStr", scoreJsonStr);
		}
	}

	@Override
	public Class<AnalyzeNvcResponse> getResponseClass() {
		return AnalyzeNvcResponse.class;
	}

}
