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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.FailedImage;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.FailedImage.ImageFile1;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.RegisteredPersonage;
import com.aliyuncs.mts.model.v20140618.RegisterMediaDetailPersonResponse.RegisteredPersonage.ImageFile;
import com.aliyuncs.transform.UnmarshallerContext;


public class RegisterMediaDetailPersonResponseUnmarshaller {

	public static RegisterMediaDetailPersonResponse unmarshall(RegisterMediaDetailPersonResponse registerMediaDetailPersonResponse, UnmarshallerContext _ctx) {
		
		registerMediaDetailPersonResponse.setRequestId(_ctx.stringValue("RegisterMediaDetailPersonResponse.RequestId"));

		List<RegisteredPersonage> registeredPersonages = new ArrayList<RegisteredPersonage>();
		for (int i = 0; i < _ctx.lengthValue("RegisterMediaDetailPersonResponse.RegisteredPersonages.Length"); i++) {
			RegisteredPersonage registeredPersonage = new RegisteredPersonage();
			registeredPersonage.setQuality(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Quality"));
			registeredPersonage.setPersonName(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].PersonName"));
			registeredPersonage.setGender(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Gender"));
			registeredPersonage.setFaceId(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].FaceId"));
			registeredPersonage.setTarget(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].Target"));
			registeredPersonage.setImageId(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageId"));

			ImageFile imageFile = new ImageFile();
			imageFile.setObject(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Object"));
			imageFile.setLocation(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Location"));
			imageFile.setBucket(_ctx.stringValue("RegisterMediaDetailPersonResponse.RegisteredPersonages["+ i +"].ImageFile.Bucket"));
			registeredPersonage.setImageFile(imageFile);

			registeredPersonages.add(registeredPersonage);
		}
		registerMediaDetailPersonResponse.setRegisteredPersonages(registeredPersonages);

		List<FailedImage> failedImages = new ArrayList<FailedImage>();
		for (int i = 0; i < _ctx.lengthValue("RegisterMediaDetailPersonResponse.FailedImages.Length"); i++) {
			FailedImage failedImage = new FailedImage();
			failedImage.setSuccess(_ctx.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].Success"));
			failedImage.setCode(_ctx.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].Code"));

			ImageFile1 imageFile1 = new ImageFile1();
			imageFile1.setObject(_ctx.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Object"));
			imageFile1.setLocation(_ctx.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Location"));
			imageFile1.setBucket(_ctx.stringValue("RegisterMediaDetailPersonResponse.FailedImages["+ i +"].ImageFile.Bucket"));
			failedImage.setImageFile1(imageFile1);

			failedImages.add(failedImage);
		}
		registerMediaDetailPersonResponse.setFailedImages(failedImages);
	 
	 	return registerMediaDetailPersonResponse;
	}
}