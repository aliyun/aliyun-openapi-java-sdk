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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.sas.transform.v20181203.DescribeImageScanAuthCountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImageScanAuthCountResponse extends AcsResponse {

	private String requestId;

	private ImageScan imageScan;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ImageScan getImageScan() {
		return this.imageScan;
	}

	public void setImageScan(ImageScan imageScan) {
		this.imageScan = imageScan;
	}

	public static class ImageScan {

		private String instanceId;

		private Long imageScanCapacity;

		private Long scanCount;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Long getImageScanCapacity() {
			return this.imageScanCapacity;
		}

		public void setImageScanCapacity(Long imageScanCapacity) {
			this.imageScanCapacity = imageScanCapacity;
		}

		public Long getScanCount() {
			return this.scanCount;
		}

		public void setScanCount(Long scanCount) {
			this.scanCount = scanCount;
		}
	}

	@Override
	public DescribeImageScanAuthCountResponse getInstance(UnmarshallerContext context) {
		return	DescribeImageScanAuthCountResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
