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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cloudphoto.transform.v20170711.ListPhotoFacesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhotoFacesResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private List<Face> faces;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public List<Face> getFaces() {
		return this.faces;
	}

	public void setFaces(List<Face> faces) {
		this.faces = faces;
	}

	public static class Face {

		private Long faceId;

		private String faceIdStr;

		private String faceName;

		private List<String> axis;

		public Long getFaceId() {
			return this.faceId;
		}

		public void setFaceId(Long faceId) {
			this.faceId = faceId;
		}

		public String getFaceIdStr() {
			return this.faceIdStr;
		}

		public void setFaceIdStr(String faceIdStr) {
			this.faceIdStr = faceIdStr;
		}

		public String getFaceName() {
			return this.faceName;
		}

		public void setFaceName(String faceName) {
			this.faceName = faceName;
		}

		public List<String> getAxis() {
			return this.axis;
		}

		public void setAxis(List<String> axis) {
			this.axis = axis;
		}
	}

	@Override
	public ListPhotoFacesResponse getInstance(UnmarshallerContext context) {
		return	ListPhotoFacesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
