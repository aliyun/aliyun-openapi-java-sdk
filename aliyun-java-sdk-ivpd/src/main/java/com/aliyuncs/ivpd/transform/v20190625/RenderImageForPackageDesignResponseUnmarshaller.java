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

package com.aliyuncs.ivpd.transform.v20190625;

import com.aliyuncs.ivpd.model.v20190625.RenderImageForPackageDesignResponse;
import com.aliyuncs.ivpd.model.v20190625.RenderImageForPackageDesignResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class RenderImageForPackageDesignResponseUnmarshaller {

	public static RenderImageForPackageDesignResponse unmarshall(RenderImageForPackageDesignResponse renderImageForPackageDesignResponse, UnmarshallerContext _ctx) {
		
		renderImageForPackageDesignResponse.setRequestId(_ctx.stringValue("RenderImageForPackageDesignResponse.RequestId"));
		renderImageForPackageDesignResponse.setCode(_ctx.stringValue("RenderImageForPackageDesignResponse.Code"));
		renderImageForPackageDesignResponse.setMessage(_ctx.stringValue("RenderImageForPackageDesignResponse.Message"));

		Data data = new Data();
		data.setJobId(_ctx.stringValue("RenderImageForPackageDesignResponse.Data.JobId"));
		renderImageForPackageDesignResponse.setData(data);
	 
	 	return renderImageForPackageDesignResponse;
	}
}