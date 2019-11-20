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

package com.aliyuncs.hbase.transform.v20190101;

import com.aliyuncs.hbase.model.v20190101.ResizeDiskSizeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ResizeDiskSizeResponseUnmarshaller {

	public static ResizeDiskSizeResponse unmarshall(ResizeDiskSizeResponse resizeDiskSizeResponse, UnmarshallerContext _ctx) {
		
		resizeDiskSizeResponse.setRequestId(_ctx.stringValue("ResizeDiskSizeResponse.RequestId"));
		resizeDiskSizeResponse.setOrderId(_ctx.stringValue("ResizeDiskSizeResponse.OrderId"));
	 
	 	return resizeDiskSizeResponse;
	}
}