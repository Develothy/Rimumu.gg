package gg.rimumu.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public sealed class RimumuException extends Exception {

    private static final Logger logger = LoggerFactory.getLogger(RimumuException.class);

    public RimumuException(String message) {
        super(message);
    }


    /**
     * SERVER EXCEPTION
     */

    public static final class ServerException extends RimumuException {
        public ServerException(String msg) {
            super(ErrorMsg.ServerException.getMsg());
            logger.info("error : {}", msg);
        }
    }
    public static final class RequestException extends RimumuException {
        public RequestException(String msg) {
            super(ErrorMsg.RequestException.getMsg());
            logger.info("error : {}", msg);
        }
    }

    public static final class EncryptException extends RimumuException {
        public EncryptException(String str) {
            super(str + ErrorMsg.EncryptException.getMsg());
        }
    }


    /**
     * SUMMONER EXCEPTION
     */

    public static final class SummonerNotFoundException extends RimumuException {
        public SummonerNotFoundException(String smn) {
            super(smn + ErrorMsg.SummonerNotFound.getMsg());
        }
    }

    public static final class MatchNotFoundException extends RimumuException {
        public MatchNotFoundException(String match) {
            super(match + ErrorMsg.MatchNotFound.getMsg());
        }
    }


    /**
     * MEMBER EXCEPTION
     */

    public static final class MemberAlreadyRegisteredException extends RimumuException {
        public MemberAlreadyRegisteredException(String email) {
            super(email + ErrorMsg.MemberAlreadyRegistered.getMsg());
        }
    }

    public static final class MemberValidationException extends RimumuException {
        public MemberValidationException() {
            super(ErrorMsg.MemberValidation.getMsg());
        }
    }
}
