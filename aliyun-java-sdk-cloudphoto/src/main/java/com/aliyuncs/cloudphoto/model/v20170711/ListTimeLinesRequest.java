/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cloudphoto.model.v20170711;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;

/**
 * @author auto create
 * @version 
 */
public class ListTimeLinesRequest extends RpcAcsRequest<ListTimeLinesResponse> {
	
	public ListTimeLinesRequest() {
		super("CloudPhoto", "2017-07-11", "ListTimeLines", "cloudphoto");
		setProtocol(ProtocolType.HTTPS);
	}

	private Long cursor;

	private Integer photoSize;

	private Integer timeLineCount;

	private String libraryId;

	private String storeName;

	private String timeLineUnit;

	private String filterBy;

	private String direction;

	private String order;

	public Long getCursor() {
		return this.cursor;
	}

	public void setCursor(Long cursor) {
		this.cursor = cursor;
		if(cursor != null){
			putQueryParameter("Cursor", cursor.toString());
		}
	}

	public Integer getPhotoSize() {
		return this.photoSize;
	}

	public void setPhotoSize(Integer photoSize) {
		this.photoSize = photoSize;
		if(photoSize != null){
			putQueryParameter("PhotoSize", photoSize.toString());
		}
	}

	public Integer getTimeLineCount() {
		return this.timeLineCount;
	}

	public void setTimeLineCount(Integer timeLineCount) {
		this.timeLineCount = timeLineCount;
		if(timeLineCount != null){
			putQueryParameter("TimeLineCount", timeLineCount.toString());
		}
	}

	public String getLibraryId() {
		return this.libraryId;
	}

	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
		if(libraryId != null){
			putQueryParameter("LibraryId", libraryId);
		}
	}

	public String getStoreName() {
		return this.storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
		if(storeName != null){
			putQueryParameter("StoreName", storeName);
		}
	}

	public String getTimeLineUnit() {
		return this.timeLineUnit;
	}

	public void setTimeLineUnit(String timeLineUnit) {
		this.timeLineUnit = timeLineUnit;
		if(timeLineUnit != null){
			putQueryParameter("TimeLineUnit", timeLineUnit);
		}
	}

	public String getFilterBy() {
		return this.filterBy;
	}

	public void setFilterBy(String filterBy) {
		this.filterBy = filterBy;
		if(filterBy != null){
			putQueryParameter("FilterBy", filterBy);
		}
	}

	public String getDirection() {
		return this.direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
		if(direction != null){
			putQueryParameter("Direction", direction);
		}
	}

	public String getOrder() {
		return this.order;
	}

	public void setOrder(String order) {
		this.order = order;
		if(order != null){
			putQueryParameter("Order", order);
		}
	}

	@Override
	public Class<ListTimeLinesResponse> getResponseClass() {
		return ListTimeLinesResponse.class;
	}

}
