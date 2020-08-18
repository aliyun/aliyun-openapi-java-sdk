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

import com.aliyuncs.mhub.model.v20170825.SpiCheckResourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SpiCheckResourceResponseUnmarshaller {

	public static SpiCheckResourceResponse unmarshall(SpiCheckResourceResponse spiCheckResourceResponse, UnmarshallerContext _ctx) {
		
		spiCheckResourceResponse.setInterrupt(_ctx.booleanValue("SpiCheckResourceResponse.Interrupt"));
		spiCheckResourceResponse.setInvoker(_ctx.stringValue("SpiCheckResourceResponse.Invoker"));
		spiCheckResourceResponse.setPk(_ctx.stringValue("SpiCheckResourceResponse.Pk"));
		spiCheckResourceResponse.setBid(_ctx.stringValue("SpiCheckResourceResponse.Bid"));
		spiCheckResourceResponse.setHid(_ctx.longValue("SpiCheckResourceResponse.Hid"));
		spiCheckResourceResponse.setCountry(_ctx.stringValue("SpiCheckResourceResponse.Country"));
		spiCheckResourceResponse.setTaskIdentifier(_ctx.stringValue("SpiCheckResourceResponse.TaskIdentifier"));
		spiCheckResourceResponse.setTaskExtraData(_ctx.stringValue("SpiCheckResourceResponse.TaskExtraData"));
		spiCheckResourceResponse.setGmtWakeup(_ctx.stringValue("SpiCheckResourceResponse.GmtWakeup"));
		spiCheckResourceResponse.setSuccess(_ctx.booleanValue("SpiCheckResourceResponse.Success"));
		spiCheckResourceResponse.setMessage(_ctx.stringValue("SpiCheckResourceResponse.Message"));
		spiCheckResourceResponse.setLevel(_ctx.longValue("SpiCheckResourceResponse.Level"));
		spiCheckResourceResponse.setUrl(_ctx.stringValue("SpiCheckResourceResponse.Url"));
		spiCheckResourceResponse.setPrompt(_ctx.stringValue("SpiCheckResourceResponse.Prompt"));
	 
	 	return spiCheckResourceResponse;
	}
}