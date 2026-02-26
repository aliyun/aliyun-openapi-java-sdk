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
public class ChangeLogoRequest extends RpcAcsRequest<ChangeLogoResponse> {
	   

	private String goodsId;

	private Integer pageSize;

	private Boolean changeFont;

	private Boolean changeLayout;

	private Boolean changeColor;

	private Integer pageNum;

	private Boolean changeIcon;
	public ChangeLogoRequest() {
		super("Premiumpics", "2020-05-05", "ChangeLogo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getGoodsId() {
		return this.goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
		if(goodsId != null){
			putQueryParameter("GoodsId", goodsId);
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

	public Boolean getChangeFont() {
		return this.changeFont;
	}

	public void setChangeFont(Boolean changeFont) {
		this.changeFont = changeFont;
		if(changeFont != null){
			putQueryParameter("ChangeFont", changeFont.toString());
		}
	}

	public Boolean getChangeLayout() {
		return this.changeLayout;
	}

	public void setChangeLayout(Boolean changeLayout) {
		this.changeLayout = changeLayout;
		if(changeLayout != null){
			putQueryParameter("ChangeLayout", changeLayout.toString());
		}
	}

	public Boolean getChangeColor() {
		return this.changeColor;
	}

	public void setChangeColor(Boolean changeColor) {
		this.changeColor = changeColor;
		if(changeColor != null){
			putQueryParameter("ChangeColor", changeColor.toString());
		}
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

	public Boolean getChangeIcon() {
		return this.changeIcon;
	}

	public void setChangeIcon(Boolean changeIcon) {
		this.changeIcon = changeIcon;
		if(changeIcon != null){
			putQueryParameter("ChangeIcon", changeIcon.toString());
		}
	}

	@Override
	public Class<ChangeLogoResponse> getResponseClass() {
		return ChangeLogoResponse.class;
	}

}
