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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeRdsAnalysisResourceQuotasResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsAnalysisResourceQuotasResponse extends AcsResponse {

	private String requestId;

	private List<DBNodeClass> dBNodeClassList;

	private List<EngineVersion> engineVersionList;

	private List<Mode> modeList;

	private List<StorageType> storageTypeList;

	private List<DBNodeStorage> dBNodeStorageList;

	private List<DBNodeCategory> dBNodeCategoryList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBNodeClass> getDBNodeClassList() {
		return this.dBNodeClassList;
	}

	public void setDBNodeClassList(List<DBNodeClass> dBNodeClassList) {
		this.dBNodeClassList = dBNodeClassList;
	}

	public List<EngineVersion> getEngineVersionList() {
		return this.engineVersionList;
	}

	public void setEngineVersionList(List<EngineVersion> engineVersionList) {
		this.engineVersionList = engineVersionList;
	}

	public List<Mode> getModeList() {
		return this.modeList;
	}

	public void setModeList(List<Mode> modeList) {
		this.modeList = modeList;
	}

	public List<StorageType> getStorageTypeList() {
		return this.storageTypeList;
	}

	public void setStorageTypeList(List<StorageType> storageTypeList) {
		this.storageTypeList = storageTypeList;
	}

	public List<DBNodeStorage> getDBNodeStorageList() {
		return this.dBNodeStorageList;
	}

	public void setDBNodeStorageList(List<DBNodeStorage> dBNodeStorageList) {
		this.dBNodeStorageList = dBNodeStorageList;
	}

	public List<DBNodeCategory> getDBNodeCategoryList() {
		return this.dBNodeCategoryList;
	}

	public void setDBNodeCategoryList(List<DBNodeCategory> dBNodeCategoryList) {
		this.dBNodeCategoryList = dBNodeCategoryList;
	}

	public static class DBNodeClass {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static class EngineVersion {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static class Mode {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static class StorageType {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static class DBNodeStorage {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	public static class DBNodeCategory {

		private String value;

		private String text;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}
	}

	@Override
	public DescribeRdsAnalysisResourceQuotasResponse getInstance(UnmarshallerContext context) {
		return	DescribeRdsAnalysisResourceQuotasResponseUnmarshaller.unmarshall(this, context);
	}
}
