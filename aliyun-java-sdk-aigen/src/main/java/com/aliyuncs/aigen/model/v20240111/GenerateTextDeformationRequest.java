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

package com.aliyuncs.aigen.model.v20240111;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GenerateTextDeformationRequest extends RpcAcsRequest<GenerateTextDeformationResponse> {
	   

	private String textContent;

	private String fontName;

	private String ttfUrl;

	private Long n;

	private Boolean async;

	private String prompt;

	private String outputImageRatio;
	public GenerateTextDeformationRequest() {
		super("aigen", "2024-01-11", "GenerateTextDeformation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getTextContent() {
		return this.textContent;
	}

	public void setTextContent(String textContent) {
		this.textContent = textContent;
		if(textContent != null){
			putBodyParameter("TextContent", textContent);
		}
	}

	public String getFontName() {
		return this.fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
		if(fontName != null){
			putBodyParameter("FontName", fontName);
		}
	}

	public String getTtfUrl() {
		return this.ttfUrl;
	}

	public void setTtfUrl(String ttfUrl) {
		this.ttfUrl = ttfUrl;
		if(ttfUrl != null){
			putBodyParameter("TtfUrl", ttfUrl);
		}
	}

	public Long getN() {
		return this.n;
	}

	public void setN(Long n) {
		this.n = n;
		if(n != null){
			putBodyParameter("N", n.toString());
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putBodyParameter("Async", async.toString());
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putBodyParameter("Prompt", prompt);
		}
	}

	public String getOutputImageRatio() {
		return this.outputImageRatio;
	}

	public void setOutputImageRatio(String outputImageRatio) {
		this.outputImageRatio = outputImageRatio;
		if(outputImageRatio != null){
			putBodyParameter("OutputImageRatio", outputImageRatio);
		}
	}

	@Override
	public Class<GenerateTextDeformationResponse> getResponseClass() {
		return GenerateTextDeformationResponse.class;
	}

}
