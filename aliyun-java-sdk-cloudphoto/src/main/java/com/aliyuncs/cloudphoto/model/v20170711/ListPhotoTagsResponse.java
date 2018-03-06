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
import com.aliyuncs.cloudphoto.transform.v20170711.ListPhotoTagsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPhotoTagsResponse extends AcsResponse {

	private String code;

	private String message;

	private String requestId;

	private String action;

	private List<Tag> tags;

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

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public static class Tag {

		private Long id;

		private String idStr;

		private Boolean isSubTag;

		private String name;

		private String parentTag;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIdStr() {
			return this.idStr;
		}

		public void setIdStr(String idStr) {
			this.idStr = idStr;
		}

		public Boolean getIsSubTag() {
			return this.isSubTag;
		}

		public void setIsSubTag(Boolean isSubTag) {
			this.isSubTag = isSubTag;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getParentTag() {
			return this.parentTag;
		}

		public void setParentTag(String parentTag) {
			this.parentTag = parentTag;
		}
	}

	@Override
	public ListPhotoTagsResponse getInstance(UnmarshallerContext context) {
		return	ListPhotoTagsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
