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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkeBahamutAdminupdateproductRequest extends RpcAcsRequest<UpdateLinkeBahamutAdminupdateproductResponse> {
	   

	private String icon;

	private Boolean show;

	private String cat;

	private String id;

	private Boolean openBlank;

	private List<String> menusRepeatLists;

	private Long created;

	private Long sort;

	private String url;

	private String iconTheme;

	private Boolean deleted;

	private Long lastModified;

	private String displayName;

	private String name;

	private Boolean fixed;
	public UpdateLinkeBahamutAdminupdateproductRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkeBahamutAdminupdateproduct", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
		if(icon != null){
			putBodyParameter("Icon", icon);
		}
	}

	public Boolean getShow() {
		return this.show;
	}

	public void setShow(Boolean show) {
		this.show = show;
		if(show != null){
			putBodyParameter("Show", show.toString());
		}
	}

	public String getCat() {
		return this.cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
		if(cat != null){
			putBodyParameter("Cat", cat);
		}
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id);
		}
	}

	public Boolean getOpenBlank() {
		return this.openBlank;
	}

	public void setOpenBlank(Boolean openBlank) {
		this.openBlank = openBlank;
		if(openBlank != null){
			putBodyParameter("OpenBlank", openBlank.toString());
		}
	}

	public List<String> getMenusRepeatLists() {
		return this.menusRepeatLists;
	}

	public void setMenusRepeatLists(List<String> menusRepeatLists) {
		this.menusRepeatLists = menusRepeatLists;	
		if (menusRepeatLists != null) {
			for (int i = 0; i < menusRepeatLists.size(); i++) {
				putBodyParameter("MenusRepeatList." + (i + 1) , menusRepeatLists.get(i));
			}
		}	
	}

	public Long getCreated() {
		return this.created;
	}

	public void setCreated(Long created) {
		this.created = created;
		if(created != null){
			putBodyParameter("Created", created.toString());
		}
	}

	public Long getSort() {
		return this.sort;
	}

	public void setSort(Long sort) {
		this.sort = sort;
		if(sort != null){
			putBodyParameter("Sort", sort.toString());
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

	public String getIconTheme() {
		return this.iconTheme;
	}

	public void setIconTheme(String iconTheme) {
		this.iconTheme = iconTheme;
		if(iconTheme != null){
			putBodyParameter("IconTheme", iconTheme);
		}
	}

	public Boolean getDeleted() {
		return this.deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
		if(deleted != null){
			putBodyParameter("Deleted", deleted.toString());
		}
	}

	public Long getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Long lastModified) {
		this.lastModified = lastModified;
		if(lastModified != null){
			putBodyParameter("LastModified", lastModified.toString());
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public Boolean getFixed() {
		return this.fixed;
	}

	public void setFixed(Boolean fixed) {
		this.fixed = fixed;
		if(fixed != null){
			putBodyParameter("Fixed", fixed.toString());
		}
	}

	@Override
	public Class<UpdateLinkeBahamutAdminupdateproductResponse> getResponseClass() {
		return UpdateLinkeBahamutAdminupdateproductResponse.class;
	}

}
