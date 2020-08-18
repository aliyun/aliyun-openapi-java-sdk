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

package com.aliyuncs.mhub.transform.v20170825;

import com.aliyuncs.mhub.model.v20170825.SpiLogicalDeleteResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SpiLogicalDeleteResourceResponseUnmarshaller {

	public static SpiLogicalDeleteResourceResponse unmarshall(SpiLogicalDeleteResourceResponse spiLogicalDeleteResourceResponse, UnmarshallerContext _ctx) {
		
		spiLogicalDeleteResourceResponse.setInterrupt(_ctx.booleanValue("SpiLogicalDeleteResourceResponse.Interrupt"));
		spiLogicalDeleteResourceResponse.setInvoker(_ctx.stringValue("SpiLogicalDeleteResourceResponse.Invoker"));
		spiLogicalDeleteResourceResponse.setPk(_ctx.stringValue("SpiLogicalDeleteResourceResponse.Pk"));
		spiLogicalDeleteResourceResponse.setBid(_ctx.stringValue("SpiLogicalDeleteResourceResponse.Bid"));
		spiLogicalDeleteResourceResponse.setHid(_ctx.longValue("SpiLogicalDeleteResourceResponse.Hid"));
		spiLogicalDeleteResourceResponse.setCountry(_ctx.stringValue("SpiLogicalDeleteResourceResponse.Country"));
		spiLogicalDeleteResourceResponse.setTaskIdentifier(_ctx.stringValue("SpiLogicalDeleteResourceResponse.TaskIdentifier"));
		spiLogicalDeleteResourceResponse.setTaskExtraData(_ctx.stringValue("SpiLogicalDeleteResourceResponse.TaskExtraData"));
		spiLogicalDeleteResourceResponse.setGmtWakeup(_ctx.stringValue("SpiLogicalDeleteResourceResponse.GmtWakeup"));
		spiLogicalDeleteResourceResponse.setSuccess(_ctx.booleanValue("SpiLogicalDeleteResourceResponse.Success"));
		spiLogicalDeleteResourceResponse.setMessage(_ctx.stringValue("SpiLogicalDeleteResourceResponse.Message"));
	 
	 	return spiLogicalDeleteResourceResponse;
	}
}