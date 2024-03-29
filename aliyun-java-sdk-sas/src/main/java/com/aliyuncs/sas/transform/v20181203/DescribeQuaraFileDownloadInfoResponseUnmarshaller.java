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

package com.aliyuncs.sas.transform.v20181203;

import com.aliyuncs.sas.model.v20181203.DescribeQuaraFileDownloadInfoResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeQuaraFileDownloadInfoResponseUnmarshaller {

	public static DescribeQuaraFileDownloadInfoResponse unmarshall(DescribeQuaraFileDownloadInfoResponse describeQuaraFileDownloadInfoResponse, UnmarshallerContext _ctx) {
		
		describeQuaraFileDownloadInfoResponse.setRequestId(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.RequestId"));
		describeQuaraFileDownloadInfoResponse.setUuid(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.Uuid"));
		describeQuaraFileDownloadInfoResponse.setQuaraFileId(_ctx.integerValue("DescribeQuaraFileDownloadInfoResponse.QuaraFileId"));
		describeQuaraFileDownloadInfoResponse.setDownloadUrl(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.DownloadUrl"));
		describeQuaraFileDownloadInfoResponse.setPath(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.Path"));
		describeQuaraFileDownloadInfoResponse.setMd5(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.Md5"));
		describeQuaraFileDownloadInfoResponse.setTag(_ctx.stringValue("DescribeQuaraFileDownloadInfoResponse.Tag"));
	 
	 	return describeQuaraFileDownloadInfoResponse;
	}
}