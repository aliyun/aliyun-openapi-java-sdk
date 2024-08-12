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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddDevicesFromCSVRequest extends RpcAcsRequest<AddDevicesFromCSVResponse> {
	   

	private Integer fileType;

	private Integer seatCol;

	private String fileName;

	private String siteName;

	private String siteId;
	public AddDevicesFromCSVRequest() {
		super("wyota", "2021-04-20", "AddDevicesFromCSV");
		setMethod(MethodType.POST);
	}

	public Integer getFileType() {
		return this.fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
		if(fileType != null){
			putBodyParameter("FileType", fileType.toString());
		}
	}

	public Integer getSeatCol() {
		return this.seatCol;
	}

	public void setSeatCol(Integer seatCol) {
		this.seatCol = seatCol;
		if(seatCol != null){
			putBodyParameter("SeatCol", seatCol.toString());
		}
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		if(fileName != null){
			putBodyParameter("FileName", fileName);
		}
	}

	public String getSiteName() {
		return this.siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
		if(siteName != null){
			putBodyParameter("SiteName", siteName);
		}
	}

	public String getSiteId() {
		return this.siteId;
	}

	public void setSiteId(String siteId) {
		this.siteId = siteId;
		if(siteId != null){
			putBodyParameter("SiteId", siteId);
		}
	}

	@Override
	public Class<AddDevicesFromCSVResponse> getResponseClass() {
		return AddDevicesFromCSVResponse.class;
	}

}
