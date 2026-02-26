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

package com.aliyuncs.premiumpics.model.v20200505;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.premiumpics.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListLogosRequest extends RpcAcsRequest<ListLogosResponse> {
	   

	private String authorityType;

	private String description;

	private String brandName;

	private String type;

	private String userId;

	private String fontStyle;

	private String colorStyle;

	private String industryName;

	private String industryId;

	private String styleId;

	private Integer page;

	private String slogan;

	private String logoVersion;
	public ListLogosRequest() {
		super("Premiumpics", "2020-05-05", "ListLogos");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAuthorityType() {
		return this.authorityType;
	}

	public void setAuthorityType(String authorityType) {
		this.authorityType = authorityType;
		if(authorityType != null){
			putQueryParameter("AuthorityType", authorityType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
		if(brandName != null){
			putQueryParameter("BrandName", brandName);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getFontStyle() {
		return this.fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
		if(fontStyle != null){
			putQueryParameter("FontStyle", fontStyle);
		}
	}

	public String getColorStyle() {
		return this.colorStyle;
	}

	public void setColorStyle(String colorStyle) {
		this.colorStyle = colorStyle;
		if(colorStyle != null){
			putQueryParameter("ColorStyle", colorStyle);
		}
	}

	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
		if(industryName != null){
			putQueryParameter("IndustryName", industryName);
		}
	}

	public String getIndustryId() {
		return this.industryId;
	}

	public void setIndustryId(String industryId) {
		this.industryId = industryId;
		if(industryId != null){
			putQueryParameter("IndustryId", industryId);
		}
	}

	public String getStyleId() {
		return this.styleId;
	}

	public void setStyleId(String styleId) {
		this.styleId = styleId;
		if(styleId != null){
			putQueryParameter("StyleId", styleId);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("Page", page.toString());
		}
	}

	public String getSlogan() {
		return this.slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
		if(slogan != null){
			putQueryParameter("Slogan", slogan);
		}
	}

	public String getLogoVersion() {
		return this.logoVersion;
	}

	public void setLogoVersion(String logoVersion) {
		this.logoVersion = logoVersion;
		if(logoVersion != null){
			putQueryParameter("LogoVersion", logoVersion);
		}
	}

	@Override
	public Class<ListLogosResponse> getResponseClass() {
		return ListLogosResponse.class;
	}

}
