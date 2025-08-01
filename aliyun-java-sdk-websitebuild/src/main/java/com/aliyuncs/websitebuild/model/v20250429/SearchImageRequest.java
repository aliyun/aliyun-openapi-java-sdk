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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SearchImageRequest extends RpcAcsRequest<SearchImageResponse> {
	   

	private Boolean hasPerson;

	private Integer maxWidth;

	private String ossKey;

	private String imageCategory;

	private Integer maxHeight;

	private String imageRatio;

	private String nextToken;

	private String text;

	private String colorHex;

	private Integer minHeight;

	private Integer start;

	private List<String> tags;

	private Integer size;

	private Integer minWidth;

	private Integer maxResults;
	public SearchImageRequest() {
		super("WebsiteBuild", "2025-04-29", "SearchImage");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public Boolean getHasPerson() {
		return this.hasPerson;
	}

	public void setHasPerson(Boolean hasPerson) {
		this.hasPerson = hasPerson;
		if(hasPerson != null){
			putQueryParameter("HasPerson", hasPerson.toString());
		}
	}

	public Integer getMaxWidth() {
		return this.maxWidth;
	}

	public void setMaxWidth(Integer maxWidth) {
		this.maxWidth = maxWidth;
		if(maxWidth != null){
			putQueryParameter("MaxWidth", maxWidth.toString());
		}
	}

	public String getOssKey() {
		return this.ossKey;
	}

	public void setOssKey(String ossKey) {
		this.ossKey = ossKey;
		if(ossKey != null){
			putQueryParameter("OssKey", ossKey);
		}
	}

	public String getImageCategory() {
		return this.imageCategory;
	}

	public void setImageCategory(String imageCategory) {
		this.imageCategory = imageCategory;
		if(imageCategory != null){
			putQueryParameter("ImageCategory", imageCategory);
		}
	}

	public Integer getMaxHeight() {
		return this.maxHeight;
	}

	public void setMaxHeight(Integer maxHeight) {
		this.maxHeight = maxHeight;
		if(maxHeight != null){
			putQueryParameter("MaxHeight", maxHeight.toString());
		}
	}

	public String getImageRatio() {
		return this.imageRatio;
	}

	public void setImageRatio(String imageRatio) {
		this.imageRatio = imageRatio;
		if(imageRatio != null){
			putQueryParameter("ImageRatio", imageRatio);
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

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
		if(text != null){
			putQueryParameter("Text", text);
		}
	}

	public String getColorHex() {
		return this.colorHex;
	}

	public void setColorHex(String colorHex) {
		this.colorHex = colorHex;
		if(colorHex != null){
			putQueryParameter("ColorHex", colorHex);
		}
	}

	public Integer getMinHeight() {
		return this.minHeight;
	}

	public void setMinHeight(Integer minHeight) {
		this.minHeight = minHeight;
		if(minHeight != null){
			putQueryParameter("MinHeight", minHeight.toString());
		}
	}

	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
		if(start != null){
			putQueryParameter("Start", start.toString());
		}
	}

	public List<String> getTags() {
		return this.tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;	
		if (tags != null) {
			String tagsArrVal = "";
			for(int depth1 = 0; depth1 < tags.size(); depth1++) {
				tagsArrVal += tags.get(depth1) + ",";
			}
			if (tagsArrVal.length() > 0) {
				tagsArrVal = tagsArrVal.substring(0, tagsArrVal.length() - 1);
			}
			putQueryParameter("Tags" , tagsArrVal);
		}	
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
		}
	}

	public Integer getMinWidth() {
		return this.minWidth;
	}

	public void setMinWidth(Integer minWidth) {
		this.minWidth = minWidth;
		if(minWidth != null){
			putQueryParameter("MinWidth", minWidth.toString());
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

	@Override
	public Class<SearchImageResponse> getResponseClass() {
		return SearchImageResponse.class;
	}

}
