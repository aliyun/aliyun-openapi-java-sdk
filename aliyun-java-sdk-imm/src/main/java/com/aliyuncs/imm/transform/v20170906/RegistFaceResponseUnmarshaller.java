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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.RegistFaceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegistFaceResponseUnmarshaller {

	public static RegistFaceResponse unmarshall(RegistFaceResponse registFaceResponse, UnmarshallerContext _ctx) {
		
		registFaceResponse.setRequestId(_ctx.stringValue("RegistFaceResponse.RequestId"));
		registFaceResponse.setGroupId(_ctx.stringValue("RegistFaceResponse.GroupId"));
		registFaceResponse.setImageUri(_ctx.stringValue("RegistFaceResponse.ImageUri"));
		registFaceResponse.setImageMd5(_ctx.stringValue("RegistFaceResponse.ImageMd5"));
		registFaceResponse.setImageId(_ctx.stringValue("RegistFaceResponse.ImageId"));
		registFaceResponse.setGroupName(_ctx.stringValue("RegistFaceResponse.GroupName"));
		registFaceResponse.setUser(_ctx.stringValue("RegistFaceResponse.User"));
		registFaceResponse.setRoll(_ctx.floatValue("RegistFaceResponse.Roll"));
		registFaceResponse.setFaceId(_ctx.stringValue("RegistFaceResponse.FaceId"));
		registFaceResponse.setYaw(_ctx.floatValue("RegistFaceResponse.Yaw"));
		registFaceResponse.setQuality(_ctx.floatValue("RegistFaceResponse.Quality"));
		registFaceResponse.setGlasses(_ctx.integerValue("RegistFaceResponse.Glasses"));
		registFaceResponse.setHat(_ctx.integerValue("RegistFaceResponse.Hat"));
		registFaceResponse.setPitch(_ctx.floatValue("RegistFaceResponse.Pitch"));
		registFaceResponse.setAge(_ctx.integerValue("RegistFaceResponse.Age"));
		registFaceResponse.setGender(_ctx.stringValue("RegistFaceResponse.Gender"));

		List<String> axis = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("RegistFaceResponse.Axis.Length"); i++) {
			axis.add(_ctx.stringValue("RegistFaceResponse.Axis["+ i +"]"));
		}
		registFaceResponse.setAxis(axis);
	 
	 	return registFaceResponse;
	}
}