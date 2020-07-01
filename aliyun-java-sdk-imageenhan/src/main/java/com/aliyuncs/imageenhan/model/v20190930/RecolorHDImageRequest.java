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

package com.aliyuncs.imageenhan.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageenhan.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RecolorHDImageRequest extends RpcAcsRequest<RecolorHDImageResponse> {
	   

	private List<ColorTemplate> colorTemplates;

	private String degree;

	private String url;

	private String mode;

	private Integer colorCount;

	private String refUrl;
	public RecolorHDImageRequest() {
		super("imageenhan", "2019-09-30", "RecolorHDImage", "imageenhan");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<ColorTemplate> getColorTemplates() {
		return this.colorTemplates;
	}

	public void setColorTemplates(List<ColorTemplate> colorTemplates) {
		this.colorTemplates = colorTemplates;	
		if (colorTemplates != null) {
			for (int depth1 = 0; depth1 < colorTemplates.size(); depth1++) {
				putBodyParameter("ColorTemplate." + (depth1 + 1) + ".Color" , colorTemplates.get(depth1).getColor());
			}
		}	
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
		if(degree != null){
			putBodyParameter("Degree", degree);
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putBodyParameter("Mode", mode);
		}
	}

	public Integer getColorCount() {
		return this.colorCount;
	}

	public void setColorCount(Integer colorCount) {
		this.colorCount = colorCount;
		if(colorCount != null){
			putBodyParameter("ColorCount", colorCount.toString());
		}
	}

	public String getRefUrl() {
		return this.refUrl;
	}

	public void setRefUrl(String refUrl) {
		this.refUrl = refUrl;
		if(refUrl != null){
			putBodyParameter("RefUrl", refUrl);
		}
	}

	public static class ColorTemplate {

		private String color;

		public String getColor() {
			return this.color;
		}

		public void setColor(String color) {
			this.color = color;
		}
	}

	@Override
	public Class<RecolorHDImageResponse> getResponseClass() {
		return RecolorHDImageResponse.class;
	}

}
