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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeSpecificationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSpecificationResponse extends AcsResponse {

	private String requestId;

	private List<DBInstanceClassItem> dBInstanceClass;

	private List<DBInstanceGroupCountItem> dBInstanceGroupCount;

	private List<StorageNoticeItem> storageNotice;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<DBInstanceClassItem> getDBInstanceClass() {
		return this.dBInstanceClass;
	}

	public void setDBInstanceClass(List<DBInstanceClassItem> dBInstanceClass) {
		this.dBInstanceClass = dBInstanceClass;
	}

	public List<DBInstanceGroupCountItem> getDBInstanceGroupCount() {
		return this.dBInstanceGroupCount;
	}

	public void setDBInstanceGroupCount(List<DBInstanceGroupCountItem> dBInstanceGroupCount) {
		this.dBInstanceGroupCount = dBInstanceGroupCount;
	}

	public List<StorageNoticeItem> getStorageNotice() {
		return this.storageNotice;
	}

	public void setStorageNotice(List<StorageNoticeItem> storageNotice) {
		this.storageNotice = storageNotice;
	}

	public static class DBInstanceClassItem {

		private String text;

		private String value;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class DBInstanceGroupCountItem {

		private String text;

		private String value;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	public static class StorageNoticeItem {

		private String text;

		private String value;

		public String getText() {
			return this.text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public DescribeSpecificationResponse getInstance(UnmarshallerContext context) {
		return	DescribeSpecificationResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
