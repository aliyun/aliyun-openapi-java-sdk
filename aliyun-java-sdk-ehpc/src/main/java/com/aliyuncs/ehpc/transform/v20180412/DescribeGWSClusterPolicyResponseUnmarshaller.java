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

package com.aliyuncs.ehpc.transform.v20180412;

import com.aliyuncs.ehpc.model.v20180412.DescribeGWSClusterPolicyResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGWSClusterPolicyResponseUnmarshaller {

	public static DescribeGWSClusterPolicyResponse unmarshall(DescribeGWSClusterPolicyResponse describeGWSClusterPolicyResponse, UnmarshallerContext _ctx) {
		
		describeGWSClusterPolicyResponse.setRequestId(_ctx.stringValue("DescribeGWSClusterPolicyResponse.RequestId"));
		describeGWSClusterPolicyResponse.setClipboard(_ctx.stringValue("DescribeGWSClusterPolicyResponse.Clipboard"));
		describeGWSClusterPolicyResponse.setUsbRedirect(_ctx.stringValue("DescribeGWSClusterPolicyResponse.UsbRedirect"));
		describeGWSClusterPolicyResponse.setWatermark(_ctx.stringValue("DescribeGWSClusterPolicyResponse.Watermark"));
		describeGWSClusterPolicyResponse.setLocalDrive(_ctx.stringValue("DescribeGWSClusterPolicyResponse.LocalDrive"));
	 
	 	return describeGWSClusterPolicyResponse;
	}
}