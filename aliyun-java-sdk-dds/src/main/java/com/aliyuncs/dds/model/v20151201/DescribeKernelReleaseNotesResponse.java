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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeKernelReleaseNotesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeKernelReleaseNotesResponse extends AcsResponse {

	private String requestId;

	private List<ReleaseNote> releaseNotes;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ReleaseNote> getReleaseNotes() {
		return this.releaseNotes;
	}

	public void setReleaseNotes(List<ReleaseNote> releaseNotes) {
		this.releaseNotes = releaseNotes;
	}

	public static class ReleaseNote {

		private String kernelVersion;

		private String releaseNote;

		public String getKernelVersion() {
			return this.kernelVersion;
		}

		public void setKernelVersion(String kernelVersion) {
			this.kernelVersion = kernelVersion;
		}

		public String getReleaseNote() {
			return this.releaseNote;
		}

		public void setReleaseNote(String releaseNote) {
			this.releaseNote = releaseNote;
		}
	}

	@Override
	public DescribeKernelReleaseNotesResponse getInstance(UnmarshallerContext context) {
		return	DescribeKernelReleaseNotesResponseUnmarshaller.unmarshall(this, context);
	}
}
